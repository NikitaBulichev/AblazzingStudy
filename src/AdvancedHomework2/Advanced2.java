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
        
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}