## Проект "Аккумулятор полезных ссылок"

#### Описание приложения
Веб-приложение для создания и редактирования списка полезных ссылок

#### Требования заказчика
1. Авторизация и аутентификация пользователей 
2. Возможность добавлять новую ссылку, прилагая к ней краткое описание
3. Возможность просматривать список уже добавленных ссылок
4. Кликабельность ссылок и перенаправление непосредственно на нужную страницу в Интернете
5. Возможность делиться своими ссылками с другим пользователем

#### План работы над проектом
- [x] Создать репозиторий проекта на GitHub, куда регулярно будут выкладываться релизы приложения

- [x] Продумать архитектуру и компоненты создаваемой системы

- [x] Написать тесты, описывающие базовый функционал (добавление ссылок, просмотр добавленных)

- [x] Разработать базовую версию

- Дополнение базовой версии выпусками релизов с новым функционалом:

- [ ] Поиск по сохраненным ссылкам

- [ ] Удаление добавленных ссылок

- [ ] Сортировки ссылок (по дате добавления, по имени)

- [ ] Добавлять теги и группировать по ним

- [ ] Авторизация

#### Архитектура приложения
Используем фреймворк Spring Boot для разработки веб-приложения
- База данных для хранения пользователей и их ссылок 
  - JSON-файл, сохранение сущностей в него с возможностью сделать затем десериализацию
- Клиентская часть
  - форма добавления новой ссылки
  - отображение уже добавленных ссылок
  - контроллер
  
- Серверная часть
  - сущности для сохранения информации и работы с БД
  - сериализация

#### Разработка приложения
Приложение разрабатывается на языке программирования Java с использованием техник экстремального программирования.

Проделанные итерации:
1. Создан макет для работы с библиотекой Spring, добавлена документация.
2. Сделано отображение списка на веб-странице, добавлены структуры для хранения информации.
3. Сделана имплементация моделей + доработана веб-страница
4. Написаны тесты к базовой версии
