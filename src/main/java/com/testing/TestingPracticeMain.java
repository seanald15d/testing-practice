package com.testing;

import com.testing.repository.TestingRepository;
import com.testing.resource.TestingResource;
import com.testing.service.TestingService;
import com.testing.util.DateConverter;
import com.testing.util.HeaderDataFormatter;
import com.testing.util.MathUtils;

import java.text.ParseException;

public class TestingPracticeMain {

    private static final DateConverter dateConverter = new DateConverter();
    private static final MathUtils mathUtils = new MathUtils();
    private static final TestingRepository repository = new TestingRepository();
    private static final HeaderDataFormatter headerDataFormatter = new HeaderDataFormatter();
    private static final TestingService service = new TestingService(repository);
    private static final TestingResource resource = new TestingResource(service);

    public static void main(String[] args) throws ParseException {

        // MathUtils Functions
        System.out.println(mathUtils.add(2, 4));
        System.out.println(mathUtils.distancePoints(1, 5, 3, 2));

        // HeaderDataFormatter Functions
        System.out.println(headerDataFormatter.getGameAlias(3));

        // DateConverter Functions
        System.out.println(dateConverter.convertDateEpochToDateString(System.currentTimeMillis()));
        System.out.println(dateConverter.convertStringToDate("2012-01-31 23:59:59"));

        // TestingResource functions
        try {
            System.out.println(resource.doDataRetrieval("admin"));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
