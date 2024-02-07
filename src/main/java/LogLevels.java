public class LogLevels {
    public static String message(String logLine) {
        // Extrai a mensagem do logLine e remove os espaços em branco no início e no final
        int index = logLine.indexOf(":");
        return logLine.substring(index + 2).trim();
    }
    public static String logLevel(String logLine) {
        // Extrai o nível de log do logLine
        int index = logLine.indexOf("]");
        return logLine.substring(1, index).toLowerCase();
    }
    public static String reformat(String logLine) {
        // Extrai o nível de log e a mensagem do logLine, remove os espaços em branco no início e no final da mensagem
        String level = logLevel(logLine);
        String message = message(logLine).trim();
        return message + " (" + level + ")";
    }
}
