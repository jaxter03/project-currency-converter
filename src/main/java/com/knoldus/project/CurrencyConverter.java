class Currency{
    private double tempInrVal,finalStateValue;
    public Currency(double value,String currentState,String futureState){
        tempInrVal=switchHandler(value,currentState,"from");
        finalStateValue=switchHandler(tempInrVal,futureState,"to");
    }

    private double switchHandler(double value, String state,String conversionCase){
        switch(state){
            case "dollar":
                return dollar(value,conversionCase);

            case "inr":
                return inr(value,conversionCase);

            case "dirham":
                return dirham(value,conversionCase);

            case "afghani":
                return afghani(value,conversionCase);

            case "euro":
                return euro(value,conversionCase);

            case "yuan":
                return yuan(value,conversionCase);

            case "canadian_dollar":
                return canadian_dollar(value,conversionCase);

            case "swiss_franc":
                return swiss_franc(value,conversionCase);

            case "cuban_peso":
                return cuban_peso(value,conversionCase);

            case "yen":
                return yen(value,conversionCase);

            default:
                return 0;
        }
    }
    private double dollar(double value,String conversionCase){
        if (conversionCase == "from")
            return value*70;
        else
            return value/70;
    }
    private double inr(double value,String conversionCase){
        if (conversionCase == "from")
            return value;
        else
            return value;
    }
    private double dirham(double value,String conversionCase){
        if (conversionCase == "from")
            return value*20;
        else
            return value/20;
    }
    private double afghani(double value,String conversionCase){
        if (conversionCase == "from")
            return value*0.93;
        else
            return value/0.93;
    }
    private double euro(double value,String conversionCase){
        if (conversionCase == "from")
            return value*78.44;
        else
            return value/78.44;
    }
    private double yuan(double value,String conversionCase){
        if (conversionCase == "from")
            return value*10.26;
        else
            return value/10.26;
    }
    private double canadian_dollar(double value,String conversionCase){
        if (conversionCase == "from")
            return value*54.07;
        else
            return value/54.07;
    }
    private double swiss_franc(double value,String conversionCase){
        if (conversionCase == "from")
            return value*73.16;
        else
            return value/73.16;
    }
    private double cuban_peso(double value,String conversionCase){
        if (conversionCase == "from")
            return value*71.20;
        else
            return value/71.20;
    }
    private double yen(double value,String conversionCase){
        if (conversionCase == "from")
            return value*0.65;
        else
            return value/0.65;
    }
    public void printCurr(){
        System.out.println(tempInrVal);
        System.out.println(finalStateValue);
    }
}


public class CurrencyConverter{
    public static void main(String[] args){
        String currentState="dollar";
        String futureState="euro";
        Currency c=new Currency(1,currentState,futureState);
        c.printCurr();
    }
}
