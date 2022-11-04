import re

# isu_number = 373750
regexp = r":-{P"


def testRegexp(value):
    match = re.findall(regexp, value)
    print(len(match))


testRegexp(":-{p :-{P :-{")
testRegexp(":::---{{{P")
testRegexp(";-{p :-{P test")
testRegexp(":-{P :-{P :-{P")
testRegexp(":-uwupP%<{}{P\/")
