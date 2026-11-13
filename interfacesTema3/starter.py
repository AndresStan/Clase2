import mysql.connector
from Ejercicios.Ejercicio1 import Ui_MainWindow
from PyQt6.QtWidgets import QMainWindow, QApplication

class MainWindow(QMainWindow, Ui_MainWindow):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.show()
        
        
            
            
app = QApplication([])
ventana = MainWindow()
ventana.show()
app.exec()
