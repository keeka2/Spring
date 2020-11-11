from flask import Flask, jsonify
from flask_cors import CORS
from urllib.request import urlopen
import xml.etree.ElementTree as ET
from pandas.core.frame import DataFrame

app = Flask(__name__)
CORS(app)

@app.route("/")
def index():
    str='''
        <h1>helloworld</h1>
    '''
    return jsonify(code=str)

@app.route("/evCar", methods=['GET'])
def ev_car():
    spec = "http://open.ev.or.kr:8080/openapi/services/EvCharger/getChargerInfo?ServiceKey=FDp2a3vCnN%2BVvgfwp%2BneIQPvN3zTM7aLpEznSGbkyDN47qXAmtPene0L3A8mgUsbO%2F7pzLR3EX7rdD0%2B6wZe3Q%3D%3D"

    res = urlopen(spec).read()
    xmlDoc = ET.fromstring(res)
    items = xmlDoc.find('body').find('items')
    #body안에 있는 items는 item을 여러 개 가지고 있는 리스트 구조

    rows=[]
    for node in items:
        statNm = node.find('statNm').text
        addr = node.find('addr').text
        rows.append({'s_name':statNm, 'addr':addr})
    df = DataFrame(rows)

    json = df.to_json(orient='records')

    return json