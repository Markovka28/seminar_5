I - В классе Controller^
Training_Group_Service передан в конструктор Controller вместо создания
нового экземпляра внутри конструктора с помощью инверсии управления (IoC).
Это позволит контролировать, какой экземпляр Training_Group_Service
используется в Controller
 
  public Controller(Training_Group_Service training_group_service) {
          this.training_group_service = training_group_service;
  
вместе
 
public Controller() {
training_group_service = new Training_Group_Service();
    }

   II - В классе Training_Group_Service внедрена зависимость @Service, в класс Controller добавлено @Component путем использования фреймворка, Spring,
  для автоматического создания экземпляров Training_Group_Service и передачи их в Controller.
  Также для контроля, какой экземпляр Training_Group_Service используется в Controller

  при этом в pom для работы @Service и @Component добавлено:

  <dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.3.22</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>5.3.22</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-beans</artifactId>
        <version>5.3.22</version>
    </dependency>
</dependencies>
