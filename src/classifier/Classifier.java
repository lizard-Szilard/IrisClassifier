package classifier;

public class Classifier {

	public String predict(double panjangSpl, double lebarSpl, double panjangPtl, double lebarPtl) {

		if (panjangSpl >= 4.3 && panjangSpl <= 5.8 && lebarSpl >= 2.3 && lebarSpl <= 4.4 && panjangPtl >= 1.0 && panjangPtl <= 1.9 && lebarPtl >= 0.1 && lebarPtl <= 0.6) {
			return "setosa";
		} else if (panjangSpl >= 4.9 && panjangSpl <= 7.0 && lebarSpl >= 2.0 && lebarSpl <= 3.4 && panjangPtl >= 3.0 && panjangPtl <= 5.1 && lebarPtl >= 1.0 && lebarPtl <= 1.8) {
			return "versicolor";
		} else if (panjangSpl >= 4.9 && panjangSpl <= 7.9 && lebarSpl >= 2.2 && lebarSpl <= 3.8 && panjangPtl >= 4.5 && panjangPtl <= 6.9 && lebarPtl >= 1.4 && lebarPtl <= 2.5) {
			return "virginica";
		}
		return null;
	       
    }
    
}