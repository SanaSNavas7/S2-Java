����   C }
      Staff <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  Enter Department: 
      java/io/PrintStream print (Ljava/lang/String;)V
     ! nextLine ()Ljava/lang/String;	 # $ % & ' Teacher 
department Ljava/lang/String; ) Enter number of subjects: 
  + , - nextInt ()I / java/lang/String	 # 1 2 3 subjects [Ljava/lang/String; 5 Enter subjects:
  7 8  println   : ; < makeConcatWithConstants (I)Ljava/lang/String; > 
--- Teacher Details ---	 # @ A B empId I  :	 # E F ' name  H ; I &(Ljava/lang/String;)Ljava/lang/String;	 # K L M salary D  O ; P (D)Ljava/lang/String;	 # R S ' address  H  H W 
Subjects:   H
  Z 8  Code LineNumberTable StackMapTable display 3 
SourceFile singleInheritance.java BootstrapMethods d Subject :  f Employee ID:  h Name:  j 	Salary:  l 
Address:  n Department:  p   r
 s t u ; v $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses y %java/lang/invoke/MethodHandles$Lookup { java/lang/invoke/MethodHandles Lookup   #       & '     2 3         [   �     g*� � Y� 	� L� � *+� � "� (� +� *=+� W*� .� 0� 4� 6>� !� `� 9  � *� 0+� S����    \   :    "  #  %  &  ( ' ) , * 1 , 9 - A . H / V 0 ` . f 2 ]    � C  #   � "   ^   [   �     �� =� 6� *� ?� C  � 6� *� D� G  � 6� *� J� N  � 6� *� Q� T  � 6� *� "� U  � 6� V� *� 0L+�=>� +2:� � X  � ���� � Y�    \   2    5  6  7 & 8 5 9 D : S ; [ < o = | < � ? � @ ]    � e _�   `    a b   ,  q  c q  e q  g q  i q  k q  m q  o w   
  x z | 