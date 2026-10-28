from EjercicioMandado1MIO import Ui_MainWindow
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget

class MainWindow(QMainWindow, Ui_MainWindow):
    def __init__(self):
        super(MainWindow, self).__init__()
        self.setupUi(self)
        self.show()
        
app = QApplication([])
app.setStyle("Fusion")
with open("estilos/EjercicioMandado1.qss", "r") as f:
    app.setStyleSheet(f.read())
ventana = MainWindow()
app.exec()