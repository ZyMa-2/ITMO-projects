import yaml
import json


def json_to_yaml_with_library(json_str) -> str:
    return yaml.dump(json.loads(json_str), allow_unicode=True)
