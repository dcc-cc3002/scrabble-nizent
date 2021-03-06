package cl.uchile.dcc.scrabble.models.type;

/**
 * This class represents a binary number and its behavior
 * Negative numbers start with a '1' char, and positive numbers start with '0'
 * Supports only 32 bit binaries
 * @author Nicolás Zenteno Guardia
 */
public class ScrabbleBinary extends AbstractNumber implements IEncodedInteger, ILogic {
    private String value;

    /**
     * Creates a new Binary number
     * @param value a String in 01110010101010100 format
     */
    public ScrabbleBinary(String value){
        this.value = value;
    }

    /**
     * Returns the hash code of the object
     * @return class hash code
     */
    @Override
    public int hashCode(){
        return value.hashCode();
    }

    /**
     * Transforms the ScrabbleBinary into a ScrabbleBinary
     * @return a new equivalent ScrabbleBinary
     */
    @Override
    public ScrabbleBinary transformToScrabbleBinary() {
        return new ScrabbleBinary(this.value);
    }

    /**
     * Transforms the ScrabbleBinary into a ScrabbleInt
     * @return a new ScrabbleInt with an int equivalent to the binary String
     */
    @Override
    public ScrabbleInt transformToScrabbleInt() {
        return new ScrabbleInt(this.toInt());
    }

    /**
     * Transforms the ScrabbleBinary into a ScrabbleFloat
     * @return a new ScrabbleFloat containing a double equivalent to the binary String
     */
    @Override
    public ScrabbleFloat transformToScrabbleFloat() {
        return new ScrabbleFloat(this.toInt());
    }

    /**
     * Sums an IInteger
     * @param iInteger the IInteger object
     * @return an IInteger containing the sum of the values
     */
    @Override
    public IInteger sum(IInteger iInteger) {
        return iInteger.sumToBinary(this);
    }

    /**
     * Subtracts an IInteger number
     * @param iInteger the IInteger object
     * @return
     *      an IInteger containing the result of
     *      ScrabbleBinary int equivalent value minus IInteger value
     */
    @Override
    public IInteger subtract(IInteger iInteger) {
        return iInteger.subtractToBinary(this);
    }

    /**
     * Divides the ScrabbleBinary by an IInteger number
     * @param iInteger the IInteger number
     * @return
     *      an IInteger containing the result of
     *      the ScrabbleBinary int equivalent value divided by IInteger value
     */
    @Override
    public IInteger divideBy(IInteger iInteger) {
        return iInteger.divideToBinary(this);
    }

    /**
     * Multiplies the ScrabbleBinary by an IInteger number
     * @param iInteger the IInteger number
     * @return
     *      an IInteger containing the result of
     *      the ScrabbleBinary int equivalent value multiplied by IInteger value
     */
    @Override
    public IInteger multiplyBy(IInteger iInteger) {
        return iInteger.multiplyToBinary(this);
    }

    /**
     * Sums a ScrabbleInt
     * @param scrabbleInt the ScrabbleInt object
     * @return
     *      a new ScrabbleInt containing the sum of the values
     */
    @Override
    public ScrabbleInt sumToInt(ScrabbleInt scrabbleInt) {
        return new ScrabbleInt(this.toInt()+scrabbleInt.value());
    }

    /**
     * Sums a ScrabbleBinary
     * @param scrabbleBinary the Scrabble Binary object
     * @return
     *      a new ScrabbleBinary containing a binary representation of
     *      the sum of the values
     */
    @Override
    public ScrabbleBinary sumToBinary(ScrabbleBinary scrabbleBinary) {
        return new ScrabbleInt(scrabbleBinary.toInt()+this.toInt()).transformToScrabbleBinary();
    }

    /**
     * Subtracts to a ScrabbleBinary
     * @param scrabbleBinary the ScrabbleBinary object
     * @return
     *      a new ScrabbleBinary containing a binary representation of
     *      the result of the input ScrabbleBinary int value minus the ScrabbleBinary int value
     */
    @Override
    public ScrabbleBinary subtractToBinary(ScrabbleBinary scrabbleBinary) {
        return new ScrabbleInt(scrabbleBinary.toInt()-this.toInt()).transformToScrabbleBinary();
    }

    /**
     * Subtracts to a ScrabbleInt
     * @param scrabbleInt the ScrabbleInt object
     * @return
     *      a new ScrabbleInt containing
     *      the result of the ScrabbleInt value minus the ScrabbleBinary int value
     */
    @Override
    public ScrabbleInt subtractToInt(ScrabbleInt scrabbleInt) {
        return new ScrabbleInt(scrabbleInt.value()-this.toInt());
    }

    /**
     * Divide a ScrabbleInt
     * @param scrabbleInt the ScrabbleInt object
     * @return
     *      a new ScrabbleInt containing
     *      the result of the ScrabbleInt value divided by the ScrabbleBinary int value
     */
    @Override
    public ScrabbleInt divideToInt(ScrabbleInt scrabbleInt) {
        return new ScrabbleInt( scrabbleInt.value()/this.toInt());
    }

    /**
     * Multiplies a ScrabbleInt
     * @param scrabbleInt the ScrabbleInt object
     * @return
     *      a new ScrabbleInt containing
     *      the result of the ScrabbleInt value multiplied by the ScrabbleBinary int value
     */
    @Override
    public ScrabbleInt multiplyToInt(ScrabbleInt scrabbleInt) {
        return new ScrabbleInt(this.toInt()*scrabbleInt.value());
    }

    /**
     * {@inheritDoc}
     *
     * Returns a new ScrabbleFloat containing the scrabbleFloat summed
     * by this object int value
     *
     * @return
     */
    @Override
    public ScrabbleFloat sumToFloat(ScrabbleFloat scrabbleFloat) {
        return new ScrabbleFloat(scrabbleFloat.value()+this.toInt());
    }

    /**
     *
     * {@inheritDoc}
     *
     * Returns a new ScrabbleFloat containing the ScrabbleFloat value subtracted
     * by this object int value
     *
     * @return
     */
    @Override
    public ScrabbleFloat subtractToFloat(ScrabbleFloat scrabbleFloat) {
        return new ScrabbleFloat(scrabbleFloat.value()-this.toInt());
    }

    /**
     *
     * {@inheritDoc}
     *
     * Returns a new ScrabbleFloat containing the ScrabbleFloat value
     * divided by this object int value
     *
     * @return
     */
    @Override
    public ScrabbleFloat divideToFloat(ScrabbleFloat scrabbleFloat) {
        return new ScrabbleFloat(scrabbleFloat.value()/this.toInt());
    }

    /**
     *
     * {@inheritDoc}
     *
     * Returns a new ScrabbleFloat containing the ScrabbleFloat value multiplied by
     * this object int value
     *
     * @return
     */
    @Override
    public ScrabbleFloat multiplyToFloat(ScrabbleFloat scrabbleFloat) {
        return new ScrabbleFloat(scrabbleFloat.value()*this.toInt());
    }

    /**
     * Divides a ScrabbleBinary
     * @param scrabbleBinary the ScrabbleBinary object
     * @return
     *      a new ScrabbleBinary containing a binary representation of
     *      the result of the input ScrabbleBinary int value divided by the ScrabbleBinary int value
     */
    @Override
    public ScrabbleBinary divideToBinary(ScrabbleBinary scrabbleBinary) {
        return (new ScrabbleInt(scrabbleBinary.toInt()/this.toInt())).transformToScrabbleBinary();
    }

    /**
     * Multiplies a ScrabbleBinary
     * @param scrabbleBinary the ScrabbleBinary object
     * @return
     *      a new ScrabbleBinary containing the binary representation of
     *      the multiplication between int equivalent values of the binary String's
     */
    @Override
    public ScrabbleBinary multiplyToBinary(ScrabbleBinary scrabbleBinary) {
        return (new ScrabbleInt(scrabbleBinary.toInt()*this.toInt())).transformToScrabbleBinary();
    }

    /**
     * Transforms a binary string into an int
     * @return an int equivalent to the binary
     */
    public int toInt() {
        String binary = this.value;
        if (bitToInt(binary.charAt(0)) == 0) {
            return positiveBinToInt(binary);
        } else {
            return negativeBinaryToInt(binary);
        }
    }

    /**
     * Transforms negative binaries that starts with 1 into an int
     * @param binary a binary string with 0s and 1s
     * @return the negative int
     */
    private int negativeBinaryToInt(String binary) {
        int n = binary.length() - 1;
        int w = -bitToInt(binary.charAt(0)) * (int) Math.pow(2, n);
        for (int i = n, j = 0; i > 0; i--, j++) {
            w += (int) Math.pow(2, j) * (binary.charAt(i) == '1' ? 1 : 0);
        }

        // Case 32 bits, max value of int is 2^31-1 so it must be adjusted
        int adjust32bit = n+1==32? 1 : 0;
        return w-adjust32bit;
    }

    /**
     * Transforms positive binaries that starts with 0 into an int
     * @param binary binary string with first character 0
     * @return the equivalent int
     */
    private int positiveBinToInt(String binary) {
        int w = 0;
        for (int i = binary.length() - 1, j = 0; i > 0; i--, j++) {
            w += (int) Math.pow(2, j) * bitToInt(binary.charAt(i));
        }
        return w;
    }

    /**
     * Transforms a char of 0 or 1 into an int equivalent
     * @param bit '0' or '1' char
     * @return 1 or 0 equivalent to char
     */
    private int bitToInt(char bit) {
        return bit == '0' ? 0 : 1;
    }

    /**
     * Returns the value of the Scrabble Binary
     * @return value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set value of Scrabble Binary
     * @param value string with binary format
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Transforms the ScrabbleBinary into a ScrabbleString
     * @return a ScrabbleString containing the binary String
     */
    @Override
    public ScrabbleString transformToScrabbleString() {
        return new ScrabbleString(this.toString());
    }

    /**
     * Transform the value of the ScrabbleBinary to an String
     * @return the String containing the value
     */
    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Makes a logical and operation with a ScrabbleBinary.
     * Bits of the binary strings are operated one by one from right to left with & operator
     * @param scrabbleBinary the ScrabbleBinary object
     * @return an ILogic with the result of the and operation
     */
    @Override
    public ScrabbleBinary andBinary(ScrabbleBinary scrabbleBinary) {
        return new ScrabbleBinary(binaryStringAnd(this.value, scrabbleBinary.value()));
    }

    /**
     * Makes a logical and operation between two binary Strings
     * Each bit are operated one by one starting from the right
     * @param bin1 a binary String
     * @param bin2 a binary String
     * @return a binary String containing the result of and operation
     */
    private static String binaryStringAnd(String bin1, String bin2){
        String shortest = bin1.length() < bin2.length()? bin1 : bin2 ;
        String largest = bin1.length() >= bin2.length()? bin1 : bin2 ;
        StringBuilder result = new StringBuilder();

        for (int i = largest.length()-1; i >= 0; i--) {
            if(i>largest.length()-shortest.length()-1){
                result.insert(0, charAnd(shortest.charAt(i-largest.length()+shortest.length()), largest.charAt(i)));
            } else {
                result.insert(0,charAnd(shortest.charAt(0),largest.charAt(i)));
            }
        }
        return result.toString();
    }

    /**
     * Makes a logical and operation between chars representing true or false with '1' or '0'
     * respectively, called bits
     * @param bit1 the first bit
     * @param bit2 the second bit
     * @return '1' if bit1 or bit2 is '1', '0' in other case
     */
    private static char charAnd(char bit1, char bit2){
        return (bit1 == '1') & (bit2 == '1')? '1' : '0';
    }

    /**
     * Makes a logical and operation with a ScrabbleBool
     * Bits of the binary string are operated with the ScrabbleBool boolean one by one
     * @param scrabbleBool the ScrabbleBool object
     * @return an ILogic with the result of the and operation
     */
    @Override
    public ScrabbleBinary andBool(ScrabbleBool scrabbleBool) {
        return new ScrabbleBinary(binaryStringAnd(this.value, boolToBinaryString(scrabbleBool.value())));
    }

    /**
     * Transforms a boolean into a binary String.
     * Returns "1" if true and "0" if false
     * @param bool the boolean
     * @return a binary String
     */
    private String boolToBinaryString(boolean bool){
        return bool? "1":"0";
    }

    /**
     * Makes a logical and operation with an ILogic
     * @param iLogic the ILogic object
     * @return an ILogic with the result
     */
    @Override
    public ILogic and(ILogic iLogic) {
        return iLogic.andBinary(this);
    }

    /**
     * Makes a logical or operation with a ScrabbleBinary
     * Bits of the binary strings are operated with the ScrabbleBool boolean one by one
     * @param scrabbleBinary the ScrabbleBinary object
     * @return an ILogic with the result of the or operation
     */
    @Override
    public ScrabbleBinary orBinary(ScrabbleBinary scrabbleBinary) {
        return new ScrabbleBinary(binaryStringOr(scrabbleBinary.value(),this.value));
    }

    /**
     * Makes a logical or operation between two binary strings
     * The binary strings bits are compared one by one from right to left.
     * It is assumed that to the binary string left are only '0's or only '1's
     * equivalent to the first bit, to conserve the sign
     * @param bin1 a binary String with '0's and '1's
     * @param bin2 a binary String with '0's and '1's
     * @return the result of or operation
     */
    private static String binaryStringOr(String bin1, String bin2){
        String shortest = bin1.length() < bin2.length()? bin1 : bin2 ;
        String largest = bin1.length() >= bin2.length()? bin1 : bin2 ;
        StringBuilder result = new StringBuilder();

        for (int i = largest.length()-1; i >= 0; i--) {
            if(i>largest.length()-shortest.length()-1){
                result.insert(0, charOr(shortest.charAt(i-largest.length()+shortest.length()), largest.charAt(i)));
            } else {
                result.insert(0,charOr(shortest.charAt(0),largest.charAt(i)));
            }
        }
        return result.toString();
    }

    /**
     * Makes a logical or between two char.
     * '1' represents true value, and '0' false.
     * Returns the '1' char if at least one char is '1'
     * @param bit1 a char representing a bit
     * @param bit2 a char representing a bit
     * @return the equivalent char of applying a logical or between bit1 and bit2
     */
    private static char charOr(char bit1, char bit2){
        return bit1=='1' | bit2=='1' ? '1' : '0';
    }

    /**
     * Makes a logical or operation with a ScrabbleBool
     * Bits of the binary strings are operated one by one
     * @param scrabbleBool the ScrabbleBool object
     * @return an ILogic with the result of the or operation
     */
    @Override
    public ScrabbleBinary orBool(ScrabbleBool scrabbleBool) {
        return new ScrabbleBinary(binaryStringOr(this.value, boolToBinaryString(scrabbleBool.value())));
    }

    /**
     * Makes a logical or operation with an ILogic
     * @param iLogic the ILogic object
     * @return an ILogic with the result
     */
    @Override
    public ILogic or(ILogic iLogic) {
        return iLogic.orBinary(this);
    }

    /**
     * It returns the sign of a int number
     * @param result the String sign
     * @return "0" if it is positive, "" else
     */
    public static String toBinary(int result){
        /* As it is used Integer.toBinaryString method and it contains 32 bits
        for negative numbers and ScrabbleBin supports at most 32 bits, sign
        for negative result will be the empty String */
        return result<0? Integer.toBinaryString(result):
                "0"+Integer.toBinaryString(result);
    }

    /**
     * Makes a negation operation to the object
     * Each bit is negated one by one
     * @return a new ScrabbleBinary with the result of the negation
     */
    @Override
    public ILogic negate() {
        return new ScrabbleBinary(this.negatedString());
    }

    /**
     * Returns the negation of the binary String value
     * @return negation
     */
    public String negatedString(){
        StringBuilder negated = new StringBuilder();
        int len = this.value.length();
        int j;
        for (int i = 0; i < len; i++) {
            j = len-i-1;
            negated.insert(0, negateBit(this.value.charAt(j)));
        }
        return negated.toString();
    }

    /**
     * Makes a logical negation to a bit char
     * @param bit a char representing a bit
     * @return the equivalent char of applying a logical negation to bit
     */
    private static char negateBit(char bit){
        return bit=='1'? '0' : '1';
    }

}
