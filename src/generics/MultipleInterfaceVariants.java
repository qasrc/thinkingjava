package generics;

/**
 * @author zhan
 * Created on 2017/11/27  20:56
 */
public class MultipleInterfaceVariants {
}

interface Payable<T>{}

class Employee implements Payable {}

class Hourly extends Employee implements Payable{}
