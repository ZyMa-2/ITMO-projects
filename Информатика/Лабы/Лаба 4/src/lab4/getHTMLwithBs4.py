from bs4 import BeautifulSoup
import requests


def get_html_with_bs4(url) -> str:
    html_page = requests.get(url)
    soup = BeautifulSoup(html_page.text, 'html.parser')
    schedule = soup.find("table", {"id": "2day"})
    schedule.prettify()
    return str(schedule)
