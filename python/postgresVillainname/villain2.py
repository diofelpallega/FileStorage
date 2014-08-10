from dosql import *

def index(req,month,day,color):
    v =  doSql()
    _diof = "select monthvalue from month where whatmonth ='" + month + "'"
    mV = v.execqry(_diof,False)
    _diof = "select dayvalue from day where whatday=" + str(day)
    dV = v.execqry(_diof,False)
    _diof = "select colorvalue from color where whatcolor='"+ color + "'"
    cV = v.execqry(_diof,False)
	 
    return "You are - "+mV[0][0]+" "+dV[0][0]+" "+cV[0][0]+" -"
