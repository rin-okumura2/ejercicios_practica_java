public class CarsAssemble {
    private int valorNominalHora=221;
    public double productionRatePerHour(int speed) {
        return (valorNominalHora*speed)*medidorDePorcentaje(speed);
    }

    public int workingItemsPerMinute(int speed) {

        double valorPorVelocidad=(valorNominalHora*speed);
        double valorDivididoHora=valorPorVelocidad/60;
        double val=valorDivididoHora*medidorDePorcentaje(speed);
        System.out.println("calculo "+valorDivididoHora);
        System.out.println("valor total "+val);
        return (int )val;
    }

private double medidorDePorcentaje(int velocidad){
    double multiplicador=0;
    if(velocidad>=1&&velocidad<=4){
    multiplicador=1;
    }
    else if(velocidad>=5&&velocidad<=8){
    multiplicador=0.9;
    }
    else if(velocidad==9){
        multiplicador=0.8;
    }    
    else if(velocidad==10){
    multiplicador=0.77;
    }
    return multiplicador;
}
}