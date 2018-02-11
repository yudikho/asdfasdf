public class Animal{
    private double weight;
    private String type;

    public Animal(double weight){
        this.weight=weight;
        type= "Unknown";

    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return weight;
    }
    public void setType(String x){
        this.type=x;
    }
    public String toString(){
        String result= "Weight: "+weight+" Type:"+type;
        return result;
    }
}