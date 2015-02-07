/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.GenerateTestData;

/**
 *
 * @author my301
 */
public class GenerateDate {

    private String [] monthshort = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Sep","Oct","Nov","Dec"};
    private String [] monthFull = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    private String separator, format;
    public GenerateDate(String separator, String format){
        this.format = format;
        this.separator = separator;
    }

    public String genrateRandomDate()
    {
        String randomDate ="";
        String [] parts = format.split(this.separator);
        for (int i = 0; i < parts.length; i++) {

            randomDate = randomDate + genrateRandomDateHelpMethod(parts[i]);

        }
        CommonMethodsTwo.intGen(1, 12);

        return randomDate;

    }

    private String genrateRandomDateHelpMethod(String partFormat)
    {
        /*
        String temp;
        try{
            switch (partFormat) {

                case "m":
                    temp = CommonMethodsTwo.intGen(1, 12)+this.separator;
                    break;

                case "mm":
                    temp = CommonMethodsTwo.intGen(1, 12)+this.separator;
                    if(temp.length()==1)
                    {
                        temp = "0"+temp;
                    }
                    break;

                case "mmm":
                    temp = this.monthshort[CommonMethodsTwo.intGen(1, 12)]+this.separator;
                    break;

                case "mmmm":

                    String [] monthFull = {"January","February","March","April","May","June","July","August","September","October","November","December"};
                    if(part.length()<10)
                    {
                        for (int i = 0; i < monthFull.length; i++) {
                            if(part.equalsIgnoreCase( monthFull[i]))
                            {
                                check = true;
                                break;
                            }
                        }
                    }

                    break;

                case "yy":
                    if(part.length()<3)
                    {
                        if(CommonMethodsOne.isInt(part)){
                            int temp =Integer.parseInt(part);
                            if(temp > 0 && temp < 99){
                                check = true;
                            }
                        }
                    }
                    break;

                case "yyyy":
                    if(part.length()<5)
                    {

                        if(CommonMethodsOne.isInt(part)){
                            if(part.charAt(0)== '1' || part.charAt(0)== '2'){
                                check = true;
                            }
                        }
                    }

                    break;

                case "d":
                    if(part.length()<3)
                    {
                        if(CommonMethodsOne.isInt(part)){
                            int temp =Integer.parseInt(part);
                            if(temp > 0 && temp < 32){
                                check = true;
                            }
                        }
                    }
                    break;

                case "dd":
                    if(part.length()<3)
                    {
                        if(CommonMethodsOne.isInt(part)){
                            int temp =Integer.parseInt(part);
                            if(temp > 0 && temp < 32){
                                check = true;
                            }
                        }
                    }
                    break;

                default :
                    System.out.println("default");
                    break;
            }
        }catch(Exception e){

        }
        * */
        return "";
    }


    /* for testing porpose */
    public static void main(String [] args)
    {
        GenerateDate obj = new GenerateDate(".","dd.mmm.yyyy");
    }

}
