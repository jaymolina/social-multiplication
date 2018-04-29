package microservices.boot.socialmultiplication.service;

import microservices.boot.socialmultiplication.domain.Multiplication;

/**
 * Created by javiermolinamarcilla on 29/4/18.
 */
public interface MultiplicationService {

    /*
        Creates a Multiplication Object with two randomly-
        generated factors
        between 11 and 99.
        @return a Multiplication Object with random factors.
     */

    Multiplication createRandomMultiplication();
}
