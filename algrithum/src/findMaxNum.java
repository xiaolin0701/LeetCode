package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findMaxNum {
    void find(String s) {
        int car = 0, truck = 0, bigTruck = 0;
        char[] sToCharArray = s.toCharArray();
        int length = s.length();
        for ( int i = 0 ; i < length ;  ++i) {
            if ( i == length - 1 ) {
            car++;
            }
            if ( sToCharArray[ i ] == '1' ) {
                int num = 0;
                for ( int j = 1 ; j < 3 && j+i < length ; ++j ) {
                    if ( sToCharArray[ i + j ] == '1' ) {
                        num++;
                    }
                }
                switch ( num ) {
                    case 0:
                        car++;
                    case 1:
                        truck++;
                    case 2:
                        bigTruck++;
                }
            }

        }
        List< Integer > arrayList = new ArrayList<>( Arrays.asList( car , truck , bigTruck ) );
        System.out.println( arrayList );
    }

    void main() {
        find( "10110111000101010111011" );

    }
}
