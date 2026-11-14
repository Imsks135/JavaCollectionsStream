package org.java8functionalinterface.consumer;

import java.util.function.Consumer;

public class ConsumerClass1  implements Consumer<String> {
      @Override
      public void accept(String t){
          System.out.println("The value of type T is : "+ t);
      }
}
