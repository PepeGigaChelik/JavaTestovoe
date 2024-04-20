# Тестовое здание на професcию Java Developer в Kata

## Иструкция по запуску программы Calculator

### Установка  JDK

Для начала проверим устанолвенна ли Java:
```Bash

java --version
```

Результат должен быть следующий:
```Bash
openjdk 11.0.22 2024-01-16
OpenJDK Runtime Environment (build 11.0.22+7-post-Ubuntu-0ubuntu222.04.1)
OpenJDK 64-Bit Server VM (build 11.0.22+7-post-Ubuntu-0ubuntu222.04.1, mixed mode, sharing)

javac 11.0.22
```
Иначе:
```Bash
sudo apt update
sudo apt install default-jdk
```
___
### Скачивание файлов с репозитория

Выполените команду ниже в терминале

```Bash
git clone git@github.com:PepeGigaChelik/JavaTestovoe.git
```
___
### Запуск программы

```Bash
javac -d ./out/ --sourcepath src/ src/com/sazonov/app/Calculator.java

java --class-path ./out/ com.sazonov.app.Calculator 
```
