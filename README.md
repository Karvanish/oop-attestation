# Проект Калькулятора на Java

## Описание

Этот проект представляет собой простой калькулятор, способный выполнять базовые арифметические операции: сложение, умножение и деление. Реализация проекта следует принципам SOLID и использует паттерны проектирования, включая Фабричный метод для создания операций и Стратегию для определения поведения операций. Проект также включает в себя логирование операций калькулятора и модульное тестирование с использованием JUnit.

## Технологии

- Java 8
- Maven для сборки проекта и управления зависимостями
- JUnit 5 для модульного тестирования
- SLF4J для логирования

## Установка и запуск

Чтобы собрать и запустить проект, вам понадобится установленный Maven. Следуйте этим шагам:

1. Клонируйте репозиторий:
```
git clone https://github.com/Karvanish/oop-attestation/tree/main
```
2. Перейдите в каталог проекта:
```
cd oop-attestation
```
3. Соберите проект с помощью Maven:
```
mvn clean package
```
Это создаст исполняемый JAR-файл в директории `target`.

4. Запустите калькулятор:
```
java -jar target/calculator-1.0-SNAPSHOT.jar
```
Замените имя файла JAR на актуальное, если оно отличается.

## Тестирование

Проект включает модульные тесты для каждой арифметической операции и общей логики калькулятора. Чтобы запустить тесты, используйте команду:
```
mvn test
```
