//Примитивная переменная передается по значению

//Ссылка передается по значению
//Объект передается по ссылке

В С++

typedef struct {
	int value,
	elem * next;
} elem;

int main() {
	
	elem * p = new elem;
	//(*p).value = 20;
	p -> value = 20;

	//
	delete p;
	
	elem q;
	q.value = 20;

}