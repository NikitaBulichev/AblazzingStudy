package AdvancedHomework2;

public class Advanced2 {

    public static void main(String[] args) {


        // ������� �1: �������� ����, ������� ����� ���������� ����� � result �� ��� ���,
        // ���� �� ���������� ������ 1_000_000.
        // ����:
        double increment = 0.01123;
        double result = 0;
        // ������� �� �����, ���������� ��������, ������� �������������, ����� ����� �� ��������.
        // ���� ����� �������������, �� ����� ����������� ����, ������ �� ������.
        // ��������: ����� ����� ����������, � �� ������ ��������� � ��������� ������ ����.
        // �������

        int count = 0;
        if (result < 0) {
        } else {
            while (result < 1000000) {
                count++;
                result = result + increment;
            }
            System.out.println(count);
        }
    }
}