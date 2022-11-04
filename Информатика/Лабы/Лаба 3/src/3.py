import re

zero_to_255 = "([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])"


# isu_number = 373750
def testRegexp(value):
    result = re.search(r"^[a-zA-Z0-9._]+@(?P<domain>(([a-z]+\.)+[a-z]+)|((%s\.){3,}%s))$" % (
        zero_to_255, zero_to_255), value)
    try:
        print(result.group("domain"))
    except AttributeError:
        print("Fail!")


testRegexp("students.spam@yandex.ru")
testRegexp("373750@niu.itmo.ru")
testRegexp("yandex@work.yandex.ru.something")
testRegexp("1234@gmail.com")
testRegexp("yandex.ru@192.168.0.9")
testRegexp("yandex.ru@255.25.100.99")
testRegexp("yandex.ru@192.168.0.9")

testRegexp("example@example")
testRegexp("this_is_illegal_§_@gmail.com")
testRegexp("yandex.ru@@test.com")
testRegexp("yandex.ru@192.168.0.0000")
testRegexp("yandex.ru@a.168.0.0")
testRegexp("yandex.ru@256.168.0.9")
