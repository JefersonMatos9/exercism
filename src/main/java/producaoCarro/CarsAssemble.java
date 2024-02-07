public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int carroPorHora = 221;
        double producaoHora = speed * carroPorHora;

        if (speed == 0) {
            return 0;
        }
        else if (speed >= 1 && speed <= 4) {
            return producaoHora;
        }
        else if (speed >= 5 && speed <= 8) {
            return producaoHora * 0.9;
        }
        else if (speed == 9) {
            return producaoHora * 0.8;
        }
        else {
            return producaoHora * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        double producaoHora = productionRatePerHour(speed);
        double producaoMinuto = producaoHora / 60;
        return (int) Math.floor(producaoMinuto);
    }
}
//productionRatePerHour para obter a produção por hora e
// depois a convertemos em produção por minuto. Usamos Math.
// floor para arredondar para baixo