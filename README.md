# personInfo
ENG
Implement the PersonInterface interface for a single employee database.
Declare abstact methods:
-getInfo() - getting information about the employee;
-getStatus() - obtaining information about the position;
-getFIO() - to get the employee’s full name

Declare child classes: Supervisers, Jobs, Clients.
In these classes, store information: full name, position, year of birth, department, if any, phone number, address.
Implement PersonInterface defining the necessary methods.
Create several instances of the Supervisers, Jobs, Clients classes using generic references of the PersonInterface type.
Call interface methods for these objects and make sure they work correctly.

Then add a base Persons class to store common fields.
In addition, add two static variables: employees and clients to count the company's employees and clients.
Create multiple objects using common type links. Display information on objects, as well as the number of employees and clients.


RU
Реализовать интерфейс PersonInterface для единой БД сотрудников.
Объявить абстакные методы:
-getInfo() - получение информации о сотруднике;
-getStatus() - получение информации о должности;
-getFIO() - для получения ФИО сотрудника

Объявить дочерние классы: Supervisers, Jobs, Clients.
В этих классах хранить информацию: ФИО, должность, год рождения, подразделение, если оно есть, телефон, адрес.
Реализовать PersonInterface с определением необходимых методов.
Создать несколько экземпляров классов Supervisers, Jobs, Clients, используя обобщенные ссылки типа PersonInterface.
Вызвать для этих объктов методы интерфейса и убедиться в их корректной работе.

После добавить базовый класс Persons для хранения общих полей.
Кроме того добавить две статические переменные: employees и clients для подчета сотрудников компании и клиентов.
Создать несколько объктов, используя ссылки общего типа. Вывести информацию по объектам, а также число сотрудников и клиентов.
