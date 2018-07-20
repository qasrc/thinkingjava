package net.mindview.generics;

/**
 * @author zhan
 * Created on 2017/11/19  15:14
 */
public class Widget {
    public static class Factory implements FactoryI<Widget>{
        @Override
        public Widget create() {
            return new Widget();
        }
    }
}
