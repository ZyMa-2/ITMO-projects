import re


def json_to_yaml(json_dict) -> str:
    output_string = "---\n" + parse_dict(json_dict) + "\n---"
    return output_string


def add_spacing(some_str) -> str:
    return "  " + some_str.replace("\n", "\n  ")


def parse_string(some_string) -> str:
    if re.match("/\[[0-9]+\]/", some_string):
        some_string = str(int(some_string))
    else:
        some_string = '"' + some_string + '"'
    if some_string.count("\n"):
        some_string = ">\n" + add_spacing(some_string)
    return some_string


def parse_list(main_list) -> str:
    output_string = ""
    for element in main_list:
        # output_string += "- "
        if type(element) == list:
            output_string += add_spacing(parse_list(element))
        elif type(element) == dict:
            output_string += add_spacing(parse_dict(element))
        else:
            output_string += "- " + parse_string(str(element))
        output_string += "\n"

    output_string = output_string.rstrip("\n").rstrip()
    return output_string


def parse_dict(main_dict) -> str:
    output_string = ""
    for key in main_dict.keys():
        # output_string += "- " + str(key) + ": "
        element = main_dict[key]
        if type(element) == list:
            output_string += "- " + str(key) + ":\n" + add_spacing(parse_list(element))
        elif type(element) == dict:
            output_string += "- " + str(key) + ":\n" + add_spacing(parse_dict(element))
        else:
            output_string += str(key) + ": " + parse_string(str(element))
        output_string += "\n"

    output_string = output_string.rstrip("\n").rstrip()
    return output_string
