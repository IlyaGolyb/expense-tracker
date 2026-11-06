# Expense Tracker REST API

Backend-приложение для учета расходов, разработанное для портфолио. Реализует стандартный набор CRUD-операций через RESTful API с сохранением данных в реляционную базу данных.

## Стек технологий

* **Java 17**
* **Spring Boot**
* **Spring Data JPA / Hibernate**
* **H2 Database (In-Memory)**
* **Gradle**

## Эндпоинты API

* `GET /expenses` - получить список всех расходов
* `POST /expenses` - добавить новый расход
* `DELETE /expenses/{id}` - удалить расход по ID

## Как запустить

1. Клонировать репозиторий или открыть проект в IntelliJ IDEA.
2. Запустить главный класс `DemoApplication.java`.
3. Приложение будет доступно по адресу `http://localhost:8080`.
