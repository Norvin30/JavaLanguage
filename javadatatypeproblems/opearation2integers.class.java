����   A `
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  Enter two integers: 
      java/io/PrintStream println (Ljava/lang/String;)V
     ! nextInt ()I # Sum of two integers: %d%n 
 % & ' ( ) java/lang/Integer valueOf (I)Ljava/lang/Integer;
  + , - printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream; /  Difference of two integers: %d%n 1 Product of two integers: %d%n 3 Average of two integers: @       
 7 8 9 ( : java/lang/Double (D)Ljava/lang/Double; < Distance of two integers: %d%n
 > ? @ A B java/lang/Math abs (I)I D Max integer: %d%n
 > F G H max (II)I J Min integer: %d%n
 > L M H min O opearation2integers Code LineNumberTable LocalVariableTable this Lopearation2integers; main ([Ljava/lang/String;)V args [Ljava/lang/String; sc Ljava/util/Scanner; firstInt I 	secondInt 
SourceFile opearation2integers.java ! N           P   /     *� �    Q        R        S T   	 U V  P  8 	    Ļ Y� 	� L� � +� =+� >� "� Y`� $S� *W� .� Yd� $S� *W� 0� Yh� $S� *W� 2� Y`� 4o� 6S� *W� ;� Yd� =� $S� *W� C� Y� E� $S� *W� I� Y� K� $S� *W�    Q   2      	  
     3  I  _  z  �  �  �  R   *    � W X    � Y Z   � [ \   � ] \   ^    _