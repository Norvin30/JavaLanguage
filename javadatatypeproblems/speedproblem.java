����   A j
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;   Enter Distance
      java/io/PrintStream println (Ljava/lang/String;)V
     ! nextInt ()I # Enter time as hours: 
  % & ' 	nextFloat ()F ) Enter time as minutes:  + Enter time as seconds: Ea  Bp     / 0 1 makeConcatWithConstants (F)Ljava/lang/String;@������  5 0 6 (D)Ljava/lang/String;?��Eou١  5 ; speedproblem Code LineNumberTable LocalVariableTable this Lspeedproblem; main ([Ljava/lang/String;)V java [Ljava/lang/String; sc Ljava/util/Scanner; distance I sc1 hour F sc2 minutes sc3 seconds timeseconds ms kmh D 	mileshour 
SourceFile speedproblem.java BootstrapMethods Y Speed in m/s  m/s  [ Speed in km/h  km/h ] Speed in miles/h  miles/h _
 ` a b 0 c $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses f %java/lang/invoke/MethodHandles$Lookup h java/lang/invoke/MethodHandles Lookup ! :           <   /     *� �    =        >        ? @   	 A B  <  �     �� Y� 	� L� � +� =� Y� 	� N� "� +� $8� Y� 	� :� (� +� $8� Y� 	� :� *� +� $8,j-jbb8	�	n8
� 
� .  � 
� 2k9� � 4  �  7k9� � 9  � �    =   R    	  
     #  +  1  =  E  K  W  _  e  u  |  �  �  �  �  �  >   �    � C D    � E F   � G H  # � I F  1 � J K  = x L F  K j M K  W ^ N F  e P O K  u @ P K 	 | 9 Q K 
 � # R S  �  T S   U    V W     ^  X ^  Z ^  \ d   
  e g i 