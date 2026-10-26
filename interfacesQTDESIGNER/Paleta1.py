from Ejercicio3MIO import Ui_MainWindow
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget
from PyQt6.QtGui import QPalette, QColor
from PyQt6.QtCore import Qt

class MainWindow(QMainWindow, Ui_MainWindow):
    def __init__(self):
        super(MainWindow, self).__init__()
        self.setupUi(self)
        self.show()
        
app = QApplication([])
app.setStyle("Fusion")

paleta = QPalette()
paleta.setColor(QPalette.ColorRole.Window, Qt.GlobalColor.red)
paleta.setColor(QPalette.ColorRole.WindowText, Qt.GlobalColor.blue)
paleta.setColor(QPalette.ColorRole.Text, QColor("#B6D11F"))
paleta.setColor(QPalette.ColorRole.Button, QColor(54, 255, 140))
app.setPalette(paleta)
ventana = MainWindow()
app.exec()