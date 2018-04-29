package microservices.boot.socialmultiplication.service;

/**
 * Created by javiermolinamarcilla on 29/4/18.
 */
public interface RandomGeneratorService {

    /*
        @return a randomly-generated factor. It's always a
         number between 11 and 99.
     */

    int generatedRandomFactor();
}
