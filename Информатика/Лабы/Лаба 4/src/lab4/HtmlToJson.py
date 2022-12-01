import html_to_json


def html_to_json_dict(html_string) -> dict:
    return html_to_json.convert(html_string)
