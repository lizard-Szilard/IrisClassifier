package test;

import classifier.Classifier;

public class TestRunner {

	public static void main(String[] args) {

		Classifier classifier = new Classifier();
		
		System.out.println(classifier.predict(4.3, 3.0, 1.1, 0.1));
		System.out.println(classifier.predict(4.8, 3.0, 1.4, 0.1));
		System.out.println(classifier.predict(5.2, 4.1, 1.5, 0.1));
		System.out.println(classifier.predict(4.6, 3.6, 1.0, 0.2));
		System.out.println(classifier.predict(5.1, 3.3, 1.7, 0.5));
		System.out.println(classifier.predict(5.0, 3.5, 1.6, 0.6));
		System.out.println(classifier.predict(5.0, 2.3, 3.3, 1.0));
		System.out.println(classifier.predict(4.9, 2.4, 3.3, 1.0));
		System.out.println(classifier.predict(5.0, 2.0, 3.5, 1.0));
		System.out.println(classifier.predict(6.1, 2.8, 4.0, 1.3));
		System.out.println(classifier.predict(5.7, 2.8, 4.1, 1.3));
		System.out.println(classifier.predict(5.6, 3.0, 4.1, 1.3));
		System.out.println(classifier.predict(6.1, 2.6, 5.6, 1.4));
		System.out.println(classifier.predict(6.0, 2.2, 5.0, 1.5));
		System.out.println(classifier.predict(6.3, 2.8, 5.1, 1.5));
		System.out.println(classifier.predict(7.2, 3.0, 5.8, 1.6));
		System.out.println(classifier.predict(4.9, 2.5, 4.5, 1.7));
		System.out.println(classifier.predict(6.2, 2.8, 4.8, 1.8));

	}
}