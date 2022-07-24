# SimpleSpringMock
Простая REST заглушка на фрейморке SPRING
- Обрабатывает GET и POST запросы
- Логирует свою работу в ./logs/SimpleSpringMock.log
- Отдаёт prometheus-like метрики по эндпоинту /actuator/prometheus
- Настраиваемое время отклика сервисов для тестов отказоустойчивости
## Запуск заглушки
- mvn package
- запускаем .jar
#### Итоговый размер запакованной в jar-файл заглушки ~19мб
