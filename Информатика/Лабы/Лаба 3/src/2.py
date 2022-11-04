import re


# isu_number = 373750
def testRegexp(value):

    print(re.sub("([0-1][0-9]|2[0-3]):[0-5][0-9](?::[0-5][0-9])?",
                 '(TBD)', value))


testRegexp("""Важные действия:
1. До конца месяца (30.09.22 пятница 23:59 мск) заполнить форму: https://forms.yandex.ru/u/6331fd47de885a5baaf254c9/
Таким образом вам будет зачтено посещение лекции 13.09.22. Время заполнения занимает 5-7 минут.

2. Для набора баллов за 1-ю аннотацию и за набор баллов за посещение лекции 27.09.22 есть 2 варианта:
2.1. 27.09.22 с 00:00 до 23:59 мск прислать аннотацию на почту pvbalakshin AT itmo.ru
2.2. Сдать очно на занятии 11.10.22. При этом дату сдачи по-прежнему писать 27.09.22.

3. По итогам лекции №2 от 27.09.22 вам надо будет сделать аннотацию №2 и сдать её на лекции №3 11.10.22.

4. Всего в рамках дисциплины надо будет сделать 6 лабораторных работ. Варианты заданий описываются в самих работах. Ждать выдачи варианта не надо. Лабораторные надо именно защищать на занятиях, а выполнять и готовиться к защите - дома.

5. Проверьте, что ваши одногруппники подписаны на канал. Не хватает 35 человек.""")

testRegexp("60:00:00 10:70:99 10:59:60 10:15 15:00:00")
testRegexp("00:00:00:00:00:10:20:30:40:50:60:59:58")
testRegexp("24:24:24 24:24:24 23:23:23")
testRegexp("")
