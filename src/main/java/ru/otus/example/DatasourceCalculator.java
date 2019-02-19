package ru.otus.example;


class DatasourceCalculator {

    private final DataProvider dataProvider;

    DatasourceCalculator(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    int accumulator(int ticksCounter) {
        int result = 0;
        for(int i = 0; i < ticksCounter; i++) {
            result += dataProvider.getDataInteger();
        }
        return result;
    }

    double complexCalc(int ticksCounter) {
        double result = 0;
        for(int i = 0; i < ticksCounter; i++) {
            result += dataProvider.getDataDouble(dataProvider.getDataInteger());
        }
        return result;
    }
}
