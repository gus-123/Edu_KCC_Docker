/** 
 * class 기반의 객체지향 프로그래밍
 */

class IdolModel {
  // 생성자 (public)
  name;
  year;

  constructor(name, year) {
    this.name = name;
    this.year = year;
  }
}

console.log(new IdolModel('안유진', 2003));

class IdolModel2 {
  // 생성자 (private)
  #name;
  #year;

  constructor(name, year) {
    this.#name = name;
    this.#year = year;
  }

  set name(name) {
    this.#name = name;
  }

  get name() {
    return this.#name;
  }
}

let yuJin = new IdolModel2('안유진', 2003);
//console.log(yuJin.name);  // private로 선언하여  undifined

yuJin.name = '장원영';
console.log(yuJin.name); 