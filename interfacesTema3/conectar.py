import mysql.connector
from PyQt6.QtWidgets import QMainWindow, QApplication

class MainWindow(QMainWindow):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("Conectar BD")
        try:
            self.con = mysql.connector.connect(
                host="localhost",
                port=3306,
                user="root",
                password="1234",
                database="capitales"
            )
        except mysql.connector.Error as e:
            print(e)
            
        self.cargardatos()
        
        
        
        
        
    def cargardatos(self):
        cursor=self.con.cursor()
        sql="select * from capitales"
        cursor.execute(sql)
        resultado=cursor.fetchall()
        
        for res in resultado:
            print(res)
            
        
            
            
            
app = QApplication([])
ventana = MainWindow()
ventana.show()
app.exec()
