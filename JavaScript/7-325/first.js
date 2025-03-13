// console.log("Hello");
const document_root = document.getRootNode();
console.log(document_root.childNodes);

const html_tag = document_root.childNodes[1]
console.log(html_tag);
console.log(html_tag.childNodes);
const head_tag = html_tag.childNodes[0];

console.log(head_tag);
console.log(head_tag.childNodes);
console.log(head_tag.children);
const title_tag = head_tag.children[0];

console.log("innertext", title_tag.innerText);
console.log("innercontent", title_tag.textcontent);
console.log("innerhtml", title_tag.innerHTML);
console.log("parentnode", title_tag.parentnode);
console.log("nextSibling", title_tag.nextSibling);
console.log("nextElementSibling", title_tag.nextElementSibling);

const body_tag = html_tag.childNodes[2];
console.log(body_tag);
console.log(body_tag.childNodes);
console.log(body_tag.children);

const div_tag = body_tag.children[0]
console.log(div_tag);

const container_tag = body_tag.children[1]
console.log(container_tag);
