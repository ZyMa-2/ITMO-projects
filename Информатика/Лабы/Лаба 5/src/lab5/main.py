import matplotlib.pyplot as plt
import pandas as pd


def get_data_list(column_name, date):
    temp_data = new_df.query("`<DATE>` == @date")
    return list(temp_data[column_name])


# задаём нужные даты, далее делаем запрос на фильтрацию нужных данных
dates = ["04/09/18", "04/10/18", "04/12/18"]
# df - DataFrame object
df = pd.read_csv('SPFB.RTS-12.18_180901_181231.csv', sep=',')
new_df = df.query("`<DATE>` in @dates")
# сохраняем данные в новый файл
new_df.to_csv('filtered_data.csv')

# получаем данные в виде списка для построения графика
data_for_graph = []
for cur_column_name in ("<OPEN>", "<HIGH>", "<LOW>", "<CLOSE>"):
    for cur_date in dates:
        data_for_graph.append(get_data_list(cur_column_name, cur_date))
print(data_for_graph)

plt.boxplot(data_for_graph)
plt.show()