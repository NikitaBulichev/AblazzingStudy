package module1.Homework3;

public class FinancialRecord {
    int incomes =0;

    int outcomes =0;

    public FinancialRecord(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public int getIncomes() {
        return incomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }
    public String toString() {
        return this.incomes + ":" + this.outcomes;
    }
}
