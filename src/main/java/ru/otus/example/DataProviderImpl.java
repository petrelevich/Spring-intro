package ru.otus.example;


public class DataProviderImpl implements DataProvider {

    private int intSource = 0;

    @Override
    public int getDataInteger() {
        return intSource++;
    }

    @Override
    public double getDataDouble(int seed) {
        throw new RuntimeException("service is not available");
    }
}
