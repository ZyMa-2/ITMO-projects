from lab4.HtmlToJson import html_to_json_dict
from lab4.getHTMLwithBs4 import get_html_with_bs4
from lab4.JsonToYaml import json_to_yaml
from lab4.JsonToYamlLibrary import json_to_yaml_with_library
import time


def run_my_yaml_parse():
    json_to_yaml(data_dict)


def run_library_yaml_parse():
    json_to_yaml_with_library(data_str)


def get_time(n, func) -> float:
    start_time = time.time()
    for i in range(n):
        func()
    return float(time.time() - start_time)


url = "https://itmo.ru/ru/schedule/0/P3117/schedule.htm"
data_html = get_html_with_bs4("https://itmo.ru/ru/schedule/0/P3117/schedule.htm").replace('"', "")
data_dict = html_to_json_dict(data_html)
data_str = str(data_dict).replace("'", '"')

time1, time2 = get_time(100, run_library_yaml_parse), get_time(100, run_my_yaml_parse)
print(f"Парсинг через библиотеку: {time1} seconds")
print(f"Парсинг написанной функцией: {time2} seconds")
print(
    f"Разница составляет ~{int(max(time1 / time2, time2 / time1) * 100)}% или {max(time1, time2) - min(time1, time2)} секунд")
