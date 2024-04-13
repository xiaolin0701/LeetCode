package src;

import java.util.Stack;

public class makeString {
    String makeStringFrom( String s ) {
        Stack< String > stringStack = new Stack<>();
        Stack< Integer > integerStack = new Stack<>();
        char[] sToChar = s.toCharArray();
        int length = sToChar.length;
        int index = 0;
        while ( index < length ) {
            if ( sToChar[ index ] == '[' ) {
                index++;
                StringBuilder stringBuilder = new StringBuilder();
                while ( sToChar[ index ] != ']' ) {
                    stringBuilder.append( sToChar[ index ] );
                    index++;
                }
                System.out.println( stringBuilder );
                stringStack.push( stringBuilder.toString() );
                index++;
            }else {
                StringBuilder intBuilder = new StringBuilder();
                while ( sToChar[ index ] <= '9' && sToChar[ index ] >= '0' ) {
                    intBuilder.append( sToChar[ index ] );
                    index++;
                }
                System.out.println( intBuilder );
                integerStack.push( Integer.parseInt( intBuilder.toString() ) );
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while ( !stringStack.isEmpty() ) {
            int pop = integerStack.pop();
            String string = stringStack.pop();
            for ( int i = 0 ; i < pop ; ++i ) {
                stringBuilder.insert( 0 , string );
            }
        }
        return stringBuilder.toString();
    }

    void main() {
        System.out.println(  makeStringFrom("3[a2[c]]") );

    }
}
