from lab4.HtmlToJson import html_to_json_dict
from lab4.getHTMLwithBs4 import get_html_with_bs4
from lab4.JsonToYaml import json_to_yaml
from lab4.JsonToYamlLibrary import json_to_yaml_with_library

url = "https://itmo.ru/ru/schedule/0/P3117/schedule.htm"
data_html = get_html_with_bs4("https://itmo.ru/ru/schedule/0/P3117/schedule.htm").replace('"', "")
data_dict = html_to_json_dict(data_html)
data_str = str(data_dict).replace("'", '"')
with open(r"result/data.html", "w", encoding="utf-8") as html_file:
    html_file.write(data_html)
with open(r"result/data.json", "w", encoding="utf-8") as json_file:
    json_file.write(data_str)
with open(r"result/data.yaml", "w", encoding="utf-8") as yaml_file:
    yaml_file.write(json_to_yaml(data_dict))
with open(r"result/data_with_library.yaml", "w", encoding="utf-8") as yaml_file:
    yaml_file.write(json_to_yaml_with_library(data_str))
