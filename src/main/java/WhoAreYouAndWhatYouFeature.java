public class WhoAreYouAndWhatYouFeature {
    public static void main(String[] args) {
        Homo homoSapiens = new Homo();
        homoSapiens.type = "Sapiense";
        homoSapiens.feature = "Intelligent";
        homoSapiens.years = 160000;

        homoSapiens.whoAreYou();

        Homo neandert = new Homo();
        neandert.type = "Neanderthalensis";
        neandert.feature = "Strong";
        neandert.years = 500000;

        neandert.whoAreYou();

        Homo longi = new Homo();
        longi.type = "Longi";
        longi.feature = "looks like a dragon";
        longi.years = 3000000;

        longi.whoAreYou();

    }
}
