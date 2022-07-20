package AdvancedHomework2;

import java.util.Arrays;

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

        // ������� �2: ��� ������ ������, ������������ �����. ������� ����, ������� �������� ������ ������ ������� �� 0;
        // ��������, ����: [1,1,1,1,1]
        // ��������� ���������: [0,1,0,1,0]
        // ���������: �������� ��� ������� "%".
        // �������

        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));

        // ������� �3:
        // ����:
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = false;
        int bill = 0;
        int sale =0;
        boolean sale10 = (hasElectricsProblem && hasMotorProblem)
                || (hasElectricsProblem && hasTransmissionProblem)
                || (hasElectricsProblem && hasWheelsProblem)
                || (hasMotorProblem && hasTransmissionProblem)
                || (hasMotorProblem && hasWheelsProblem)
                || (hasTransmissionProblem && hasWheelsProblem);
        boolean sale20 = hasTransmissionProblem && (hasMotorProblem || hasElectricsProblem);
        // � ���������� �������� ��������� ������. �������� ������� ������������� ��������� ��������:
        // ���� � ������ ��� ������� � ������ �� �������, �� ������ ������ ��������� � ����� 1000 ������ �� ������������.
        // ���� � ������ �������� � ����������, �� ����� � ����� 10 000.
        // ���� � ������ �������� � ����������, �� ����� � ����� 5000.
        // ���� � ������ �������� � �������� �������, �� ����� � ����� 4000.
        // ���� � ������ �������� � ��������, �� ����� � ����� 2000.
        // ���� ��� ������ �������, �� �� ����� ���� ���� ������ 10%.
        // ���� ������� ������� �������, � ��������� ��� ���������, �� �� ����� ���� ������ 20%.
        // ���� ��� ������� � ���-�� �������, �� �� ������������ ����� �� �����.
        // ��������, ��� ������ ���� � ������ �� ������� - ���� �� �����.
        // ��������� ���������: ������� �� ����� ���� �������.
        // �������


        if (hasMotorProblem) {
            bill = bill + 10000;
        }
        if (hasElectricsProblem) {
            bill = bill + 5000;
        }
        if (hasTransmissionProblem){
            bill = bill + 4000;
        }
        if (hasWheelsProblem){
            bill =bill + 2000;
        }
        if (sale10) {
            sale = 10;
        }
        if (sale20) {
            sale = 20;
        }
        if (!hasFuel && ( !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem)) {
            bill = 1000;
        } else if (!hasFuel && ( hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem)) {
            bill = 0;
            System.out.println("���������");
        }
            bill = bill - (bill / 100 * sale);

        if (bill > 0) {
            System.out.println(bill);
        }
    }
}