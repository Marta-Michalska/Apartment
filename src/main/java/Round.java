public interface Round {

    static double round(double z){

        z*=100;
        z=Math.round(z);
        z/=100;
        return z;
    }

}
